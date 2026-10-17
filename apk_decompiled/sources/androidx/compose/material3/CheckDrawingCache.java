package androidx.compose.material3;

import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class CheckDrawingCache {
    private final Path checkPath;
    private final PathMeasure pathMeasure;
    private final Path pathToDraw;

    public /* synthetic */ CheckDrawingCache(Path path, PathMeasure pathMeasure, Path path2, int i, dq dqVar) {
        this((i & 1) != 0 ? AndroidPath_androidKt.Path() : path, (i & 2) != 0 ? AndroidPathMeasure_androidKt.PathMeasure() : pathMeasure, (i & 4) != 0 ? AndroidPath_androidKt.Path() : path2);
    }

    public final Path getCheckPath() {
        return this.checkPath;
    }

    public final PathMeasure getPathMeasure() {
        return this.pathMeasure;
    }

    public final Path getPathToDraw() {
        return this.pathToDraw;
    }

    public CheckDrawingCache(Path path, PathMeasure pathMeasure, Path path2) {
        this.checkPath = path;
        this.pathMeasure = pathMeasure;
        this.pathToDraw = path2;
    }

    public CheckDrawingCache() {
        this(null, null, null, 7, null);
    }
}
