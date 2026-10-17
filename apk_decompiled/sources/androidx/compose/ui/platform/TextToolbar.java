package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import defpackage.iy;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface TextToolbar {
    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, iy iyVar, iy iyVar2, iy iyVar3, iy iyVar4, iy iyVar5, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: showMenu");
            return;
        }
        if ((i & 2) != 0) {
            iyVar = null;
        }
        if ((i & 4) != 0) {
            iyVar2 = null;
        }
        if ((i & 8) != 0) {
            iyVar3 = null;
        }
        if ((i & 16) != 0) {
            iyVar4 = null;
        }
        if ((i & 32) != 0) {
            iyVar5 = null;
        }
        textToolbar.showMenu(rect, iyVar, iyVar2, iyVar3, iyVar4, iyVar5);
    }

    TextToolbarStatus getStatus();

    void hide();

    void showMenu(Rect rect, iy iyVar, iy iyVar2, iy iyVar3, iy iyVar4);

    default void showMenu(Rect rect, iy iyVar, iy iyVar2, iy iyVar3, iy iyVar4, iy iyVar5) {
        showMenu(rect, iyVar, iyVar2, iyVar3, iyVar4);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static void showMenu(TextToolbar textToolbar, Rect rect, iy iyVar, iy iyVar2, iy iyVar3, iy iyVar4, iy iyVar5) {
            TextToolbar.super.showMenu(rect, iyVar, iyVar2, iyVar3, iyVar4, iyVar5);
        }
    }

    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, iy iyVar, iy iyVar2, iy iyVar3, iy iyVar4, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: showMenu");
            return;
        }
        if ((i & 2) != 0) {
            iyVar = null;
        }
        if ((i & 4) != 0) {
            iyVar2 = null;
        }
        if ((i & 8) != 0) {
            iyVar3 = null;
        }
        if ((i & 16) != 0) {
            iyVar4 = null;
        }
        textToolbar.showMenu(rect, iyVar, iyVar2, iyVar3, iyVar4);
    }
}
