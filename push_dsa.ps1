# Script to commit and push each DSA Java file one by one
# Run this from the repo root: e:\Java tutorial\CAMP\

$repo = "e:\Java tutorial\CAMP"
$dsaDir = "DSA"

# Get all .java files in the DSA directory
$files = Get-ChildItem -Path (Join-Path $repo $dsaDir) -Filter "*.java"

$count = 0
foreach ($file in $files) {
    # We want the relative path from the repo root
    $relativePath = "$dsaDir\$($file.Name)"
    $fullPath = $file.FullName
    
    # Check if file exists and is untracked/modified
    $status = git -C $repo status --porcelain $relativePath
    if (-not $status) {
        Write-Host "[$($count+1)/$($files.Count)] Skipping (already committed or not found): $relativePath" -ForegroundColor Yellow
        $count++
        continue
    }

    $fileName = $file.Name

    Write-Host "[$($count+1)/$($files.Count)] Adding: $fileName" -ForegroundColor Cyan
    git -C $repo add $relativePath

    Write-Host "[$($count+1)/$($files.Count)] Committing: $fileName" -ForegroundColor Green
    git -C $repo commit -m "Add $fileName - DSA solution program"

    Write-Host "[$($count+1)/$($files.Count)] Pushing: $fileName" -ForegroundColor Blue
    git -C $repo push origin main

    if ($LASTEXITCODE -ne 0) {
        Write-Host "Push failed for $fileName. Stopping." -ForegroundColor Red
        exit 1
    }

    Write-Host "[$($count+1)/$($files.Count)] Done: $fileName" -ForegroundColor Green
    Write-Host "---"
    
    # Optional short delay if you want the commits to be distinctly spaced in time visually
    # Start-Sleep -Seconds 1
    
    $count++
}

Write-Host "`nAll $($files.Count) DSA programs processed successfully!" -ForegroundColor Green
