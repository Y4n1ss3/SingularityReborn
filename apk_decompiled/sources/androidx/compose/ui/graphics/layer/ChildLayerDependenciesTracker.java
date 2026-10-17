package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.graphics.InlineClassHelperKt;
import defpackage.gb0;
import defpackage.iy;
import defpackage.ky;
import defpackage.sl0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChildLayerDependenciesTracker {
    public static final int $stable = 8;
    private gb0 dependenciesSet;
    private GraphicsLayer dependency;
    private gb0 oldDependenciesSet;
    private GraphicsLayer oldDependency;
    private boolean trackingInProgress;

    public final boolean onDependencyAdded(GraphicsLayer graphicsLayer) {
        if (!this.trackingInProgress) {
            InlineClassHelperKt.throwIllegalArgumentException("Only add dependencies during a tracking");
        }
        gb0 gb0Var = this.dependenciesSet;
        if (gb0Var != null) {
            gb0Var.d(graphicsLayer);
        } else if (this.dependency != null) {
            gb0 gb0Var2 = sl0.a;
            gb0 gb0Var3 = new gb0();
            GraphicsLayer graphicsLayer2 = this.dependency;
            graphicsLayer2.getClass();
            gb0Var3.d(graphicsLayer2);
            gb0Var3.d(graphicsLayer);
            this.dependenciesSet = gb0Var3;
            this.dependency = null;
        } else {
            this.dependency = graphicsLayer;
        }
        if (this.oldDependenciesSet != null) {
            return !r0.m(graphicsLayer);
        }
        if (this.oldDependency != graphicsLayer) {
            return true;
        }
        this.oldDependency = null;
        return false;
    }

    public final void removeDependencies(ky kyVar) {
        GraphicsLayer graphicsLayer = this.dependency;
        if (graphicsLayer != null) {
            kyVar.invoke(graphicsLayer);
            this.dependency = null;
        }
        gb0 gb0Var = this.dependenciesSet;
        if (gb0Var != null) {
            Object[] objArr = gb0Var.b;
            long[] jArr = gb0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                kyVar.invoke(objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            gb0Var.f();
        }
    }

    public final void withTracking(ky kyVar, iy iyVar) {
        this.oldDependency = this.dependency;
        gb0 gb0Var = this.dependenciesSet;
        if (gb0Var != null && gb0Var.c()) {
            gb0 gb0Var2 = this.oldDependenciesSet;
            if (gb0Var2 == null) {
                gb0 gb0Var3 = sl0.a;
                gb0Var2 = new gb0();
                this.oldDependenciesSet = gb0Var2;
            }
            gb0Var2.k(gb0Var);
            gb0Var.f();
        }
        this.trackingInProgress = true;
        iyVar.invoke();
        this.trackingInProgress = false;
        GraphicsLayer graphicsLayer = this.oldDependency;
        if (graphicsLayer != null) {
            kyVar.invoke(graphicsLayer);
        }
        gb0 gb0Var4 = this.oldDependenciesSet;
        if (gb0Var4 == null || !gb0Var4.c()) {
            return;
        }
        Object[] objArr = gb0Var4.b;
        long[] jArr = gb0Var4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            kyVar.invoke(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        gb0Var4.f();
    }
}
