# Script to commit and push each pattern Java file one by one
# Run this from the repo root: e:\Java tutorial\CAMP\

$repo = "e:\Java tutorial\CAMP"
$files = @(
    "Patterns/SquareStarPattern.java",
    "Patterns/HollowSquareStarPattern.java",
    "Patterns/HollowSquareDiagonalStarPattern.java",
    "Patterns/RhombusStarPattern.java",
    "Patterns/HollowRhombusStarPattern.java",
    "Patterns/MirroredRhombusStarPattern.java",
    "Patterns/HollowMirroredRhombusStarPattern.java",
    "Patterns/RightTriangleStarPattern.java",
    "Patterns/HollowRightTriangleStarPattern.java",
    "Patterns/MirroredRightTriangleStarPattern.java",
    "Patterns/HollowMirroredRightTriangleStarPattern.java",
    "Patterns/InvertedRightTriangleStarPattern.java",
    "Patterns/HollowInvertedRightTriangleStarPattern.java",
    "Patterns/InvertedMirroredRightTriangleStarPattern.java",
    "Patterns/HollowInvertedMirroredRightTriangleStarPattern.java",
    "Patterns/PyramidStarPattern.java",
    "Patterns/HollowPyramidStarPattern.java",
    "Patterns/InvertedPyramidStarPattern.java",
    "Patterns/HollowInvertedPyramidStarPattern.java",
    "Patterns/HalfDiamondStarPattern.java",
    "Patterns/MirroredHalfDiamondStarPattern.java",
    "Patterns/DiamondStarPattern.java",
    "Patterns/HollowDiamondStarPattern.java",
    "Patterns/RightArrowStarPattern.java",
    "Patterns/LeftArrowStarPattern.java",
    "Patterns/PlusStarPattern.java",
    "Patterns/XStarPattern.java",
    "Patterns/EightStarPattern.java",
    "Patterns/HeartStarPattern.java"
)

$count = 0
foreach ($file in $files) {
    $fullPath = Join-Path $repo $file
    
    # Check if file exists and is untracked/modified
    $status = git -C $repo status --porcelain $file
    if (-not $status) {
        Write-Host "[$($count+1)/$($files.Count)] Skipping (already committed or not found): $file" -ForegroundColor Yellow
        $count++
        continue
    }

    # Get filename without path for commit message
    $fileName = Split-Path $file -Leaf

    Write-Host "[$($count+1)/$($files.Count)] Adding: $fileName" -ForegroundColor Cyan
    git -C $repo add $file

    Write-Host "[$($count+1)/$($files.Count)] Committing: $fileName" -ForegroundColor Green
    git -C $repo commit -m "Add $fileName - star pattern program"

    Write-Host "[$($count+1)/$($files.Count)] Pushing: $fileName" -ForegroundColor Blue
    git -C $repo push origin main

    if ($LASTEXITCODE -ne 0) {
        Write-Host "Push failed for $fileName. Stopping." -ForegroundColor Red
        exit 1
    }

    Write-Host "[$($count+1)/$($files.Count)] Done: $fileName" -ForegroundColor Green
    Write-Host "---"
    $count++
}

Write-Host "`nAll $($files.Count) pattern programs pushed successfully!" -ForegroundColor Green
