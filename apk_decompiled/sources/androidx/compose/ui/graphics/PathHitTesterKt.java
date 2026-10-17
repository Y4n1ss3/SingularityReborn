package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PathHitTesterKt {
    private static final Path EmptyPath = AndroidPath_androidKt.Path();

    public static final PathHitTester PathHitTester(Path path, float f) {
        PathHitTester pathHitTester = new PathHitTester();
        pathHitTester.updatePath(path, f);
        return pathHitTester;
    }

    public static /* synthetic */ PathHitTester PathHitTester$default(Path path, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        return PathHitTester(path, f);
    }
}
