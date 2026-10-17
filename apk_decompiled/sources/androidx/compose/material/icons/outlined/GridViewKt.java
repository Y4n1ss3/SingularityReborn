package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.c21;
import defpackage.j50;
import defpackage.kf0;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GridViewKt {
    private static ImageVector _gridView;

    public static final ImageVector getGridView(Icons.Outlined outlined) {
        ImageVector imageVector = _gridView;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.GridView", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(3.0f, 3.0f, 8.0f, 8.0f, 3.0f);
        kp0.B(w, 3.0f, 9.0f, 9.0f, 5.0f);
        c21.c(w, 5.0f, 4.0f, 9.0f);
        bv.y(w, 3.0f, 13.0f, 8.0f, 8.0f);
        kf0.n(w, -8.0f, 3.0f, 9.0f, 19.0f);
        bv.h(w, 5.0f, -4.0f, 4.0f, 19.0f);
        bv.y(w, 13.0f, 3.0f, 8.0f, 8.0f);
        bv.z(w, 3.0f, 13.0f, 19.0f, 9.0f);
        j50.D(w, -4.0f, 5.0f, 4.0f, 9.0f);
        bv.y(w, 13.0f, 13.0f, 8.0f, 8.0f);
        kf0.n(w, -8.0f, 13.0f, 19.0f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(w, -4.0f, -4.0f, 4.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gridView = build;
        build.getClass();
        return build;
    }
}
