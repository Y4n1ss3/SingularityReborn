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
import defpackage.af0;
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LeakRemoveKt {
    private static ImageVector _leakRemove;

    public static final ImageVector getLeakRemove(Icons.Outlined outlined) {
        ImageVector imageVector = _leakRemove;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LeakRemove", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(14.0f, 3.0f, -2.0f);
        a.curveToRelative(0.0f, 1.35f, -0.31f, 2.63f, -0.84f, 3.77f);
        a.lineToRelative(1.49f, 1.49f);
        a.curveTo(13.51f, 6.7f, 14.0f, 4.91f, 14.0f, 3.0f);
        bv.v(a, 21.0f, 12.0f, -2.0f);
        a.curveToRelative(-1.91f, 0.0f, -3.7f, 0.49f, -5.27f, 1.35f);
        a.lineToRelative(1.49f, 1.49f);
        a.curveToRelative(1.15f, -0.53f, 2.43f, -0.84f, 3.78f, -0.84f);
        bv.v(a, 21.0f, 16.0f, -2.0f);
        a.curveToRelative(-0.79f, 0.0f, -1.54f, 0.13f, -2.24f, 0.37f);
        a.lineToRelative(1.68f, 1.68f);
        a.curveToRelative(0.19f, -0.01f, 0.37f, -0.05f, 0.56f, -0.05f);
        k4.r(a, 10.0f, 3.0f, 8.0f, 3.0f);
        a.curveToRelative(0.0f, 0.19f, -0.04f, 0.37f, -0.06f, 0.56f);
        a.lineToRelative(1.68f, 1.68f);
        a.curveToRelative(0.25f, -0.7f, 0.38f, -1.46f, 0.38f, -2.24f);
        k4.r(a, 4.41f, 2.86f, 3.0f, 4.27f);
        a.lineToRelative(2.84f, 2.84f);
        a.curveTo(5.03f, 7.67f, 4.06f, 8.0f, 3.0f, 8.0f);
        a.verticalLineToRelative(2.0f);
        a.curveToRelative(1.61f, 0.0f, 3.09f, -0.55f, 4.27f, -1.46f);
        a.lineTo(8.7f, 9.97f);
        a.curveTo(7.14f, 11.24f, 5.16f, 12.0f, 3.0f, 12.0f);
        a.verticalLineToRelative(2.0f);
        a.curveToRelative(2.72f, 0.0f, 5.2f, -0.99f, 7.11f, -2.62f);
        a.lineToRelative(2.51f, 2.51f);
        a.curveTo(10.99f, 15.81f, 10.0f, 18.29f, 10.0f, 21.0f);
        a.horizontalLineToRelative(2.0f);
        a.curveToRelative(0.0f, -2.16f, 0.76f, -4.14f, 2.03f, -5.7f);
        a.lineToRelative(1.43f, 1.43f);
        a.curveTo(14.55f, 17.91f, 14.0f, 19.39f, 14.0f, 21.0f);
        a.horizontalLineToRelative(2.0f);
        a.curveToRelative(0.0f, -1.06f, 0.33f, -2.03f, 0.89f, -2.84f);
        a.lineTo(19.73f, 21.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(a, 1.41f, -1.41f, 4.41f, 2.86f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _leakRemove = build;
        build.getClass();
        return build;
    }
}
