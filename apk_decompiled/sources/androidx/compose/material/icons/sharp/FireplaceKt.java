package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FireplaceKt {
    private static ImageVector _fireplace;

    public static final ImageVector getFireplace(Icons.Sharp sharp) {
        ImageVector imageVector = _fireplace;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Fireplace", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(2.0f, 2.0f, 20.0f, 20.0f, 2.0f);
        k4.w(w, 2.0f, 13.2f, 13.74f);
        w.curveToRelative(-0.08f, -0.46f, -0.07f, -0.85f, 0.08f, -1.28f);
        w.curveToRelative(0.54f, 1.21f, 2.15f, 1.64f, 1.98f, 3.18f);
        w.curveToRelative(-0.19f, 1.69f, -2.11f, 2.37f, -3.39f, 1.32f);
        w.curveToRelative(0.76f, -0.24f, 1.4f, -1.04f, 1.53f, -1.63f);
        w.curveTo(13.52f, 14.78f, 13.29f, 14.29f, 13.2f, 13.74f);
        r6.B(w, 20.0f, 20.0f, -2.0f, -2.0f);
        w.horizontalLineToRelative(-2.02f);
        w.curveToRelative(0.63f, -0.84f, 1.02f, -1.87f, 1.02f, -3.0f);
        w.curveToRelative(0.0f, -1.89f, -1.09f, -2.85f, -1.85f, -3.37f);
        w.curveTo(12.2f, 9.61f, 13.0f, 7.0f, 13.0f, 7.0f);
        w.curveToRelative(-6.73f, 3.57f, -6.02f, 7.47f, -6.0f, 8.0f);
        w.curveToRelative(0.03f, 0.96f, 0.49f, 2.07f, 1.23f, 3.0f);
        uf.B(w, 6.0f, 2.0f, 4.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(w, 16.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fireplace = build;
        build.getClass();
        return build;
    }
}
