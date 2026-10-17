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
import defpackage.gy;
import defpackage.j50;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SavingsKt {
    private static ImageVector _savings;

    public static final ImageVector getSavings(Icons.Outlined outlined) {
        ImageVector imageVector = _savings;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Savings", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.0f, 10.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveTo(15.0f, 10.55f, 15.0f, 10.0f);
        af0.r(b, 8.0f, 9.0f, 5.0f, 7.0f);
        bv.s(b, 8.0f, 9.0f, 22.0f, 7.5f);
        b.verticalLineToRelative(6.97f);
        b.lineToRelative(-2.82f, 0.94f);
        b.lineTo(17.5f, 21.0f);
        af0.m(b, 12.0f, 21.0f, -2.0f, -2.0f);
        b.verticalLineToRelative(2.0f);
        b.lineToRelative(-5.5f, 0.0f);
        b.curveTo(4.5f, 21.0f, 2.0f, 12.54f, 2.0f, 9.5f);
        b.reflectiveCurveTo(4.46f, 4.0f, 7.5f, 4.0f);
        b.lineToRelative(5.0f, 0.0f);
        b.curveToRelative(0.91f, -1.21f, 2.36f, -2.0f, 4.0f, -2.0f);
        b.curveTo(17.33f, 2.0f, 18.0f, 2.67f, 18.0f, 3.5f);
        b.curveToRelative(0.0f, 0.21f, -0.04f, 0.4f, -0.12f, 0.58f);
        b.curveToRelative(-0.14f, 0.34f, -0.26f, 0.73f, -0.32f, 1.15f);
        gy.w(b, 2.27f, 2.27f, 22.0f);
        b.moveTo(20.0f, 9.5f);
        b.horizontalLineToRelative(-1.0f);
        b.lineTo(15.5f, 6.0f);
        b.curveToRelative(0.0f, -0.65f, 0.09f, -1.29f, 0.26f, -1.91f);
        b.curveTo(14.79f, 4.34f, 14.0f, 5.06f, 13.67f, 6.0f);
        b.lineTo(7.5f, 6.0f);
        b.curveTo(5.57f, 6.0f, 4.0f, 7.57f, 4.0f, 9.5f);
        b.curveToRelative(0.0f, 1.88f, 1.22f, 6.65f, 2.01f, 9.5f);
        af0.m(b, 8.0f, 19.0f, -2.0f, 6.0f);
        b.verticalLineToRelative(2.0f);
        b.lineToRelative(2.01f, 0.0f);
        b.lineToRelative(1.55f, -5.15f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(b, 20.0f, 13.03f, 9.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _savings = build;
        build.getClass();
        return build;
    }
}
