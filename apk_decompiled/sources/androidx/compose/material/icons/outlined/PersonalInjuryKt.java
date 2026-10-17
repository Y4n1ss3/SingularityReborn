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
import defpackage.fc;
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersonalInjuryKt {
    private static ImageVector _personalInjury;

    public static final ImageVector getPersonalInjury(Icons.Outlined outlined) {
        ImageVector imageVector = _personalInjury;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PersonalInjury", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 10.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        b.reflectiveCurveTo(8.0f, 3.79f, 8.0f, 6.0f);
        b.curveTo(8.0f, 8.21f, 9.79f, 10.0f, 12.0f, 10.0f);
        b.close();
        b.moveTo(12.0f, 4.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.curveTo(10.0f, 4.9f, 10.9f, 4.0f, 12.0f, 4.0f);
        b.close();
        b.moveTo(18.39f, 12.56f);
        b.curveTo(16.71f, 11.7f, 14.53f, 11.0f, 12.0f, 11.0f);
        b.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        b.curveTo(4.61f, 13.07f, 4.0f, 14.1f, 4.0f, 15.22f);
        kf0.r(b, 22.0f, 2.0f, -6.78f);
        b.curveToRelative(0.0f, -0.38f, 0.2f, -0.72f, 0.52f, -0.88f);
        b.curveTo(7.71f, 13.73f, 9.63f, 13.0f, 12.0f, 13.0f);
        b.curveToRelative(0.76f, 0.0f, 1.47f, 0.07f, 2.13f, 0.2f);
        b.lineToRelative(-1.55f, 3.3f);
        b.horizontalLineTo(9.75f);
        b.curveTo(8.23f, 16.5f, 7.0f, 17.73f, 7.0f, 19.25f);
        b.curveTo(7.0f, 20.77f, 8.23f, 22.0f, 9.75f, 22.0f);
        b.horizontalLineToRelative(2.18f);
        b.horizontalLineTo(18.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineToRelative(-4.78f);
        b.curveTo(20.0f, 14.1f, 19.39f, 13.07f, 18.39f, 12.56f);
        r6.g(b, 10.94f, 20.0f, 9.75f);
        b.curveTo(9.34f, 20.0f, 9.0f, 19.66f, 9.0f, 19.25f);
        b.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        gy.n(b, 1.89f, 10.94f, 20.0f);
        b.moveTo(18.0f, 20.0f);
        b.horizontalLineToRelative(-4.85f);
        b.lineToRelative(2.94f, -6.27f);
        b.curveToRelative(0.54f, 0.2f, 1.01f, 0.41f, 1.4f, 0.61f);
        b.curveTo(17.8f, 14.5f, 18.0f, 14.84f, 18.0f, 15.22f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personalInjury = build;
        build.getClass();
        return build;
    }
}
