package androidx.compose.material.icons.filled;

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
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersonalInjuryKt {
    private static ImageVector _personalInjury;

    public static final ImageVector getPersonalInjury(Icons.Filled filled) {
        ImageVector imageVector = _personalInjury;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PersonalInjury", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.0f, 6.0f);
        b.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        b.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        b.curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f);
        b.reflectiveCurveTo(8.0f, 8.21f, 8.0f, 6.0f);
        af0.l(b, 17.0f, 22.0f, 1.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.lineToRelative(0.0f, -4.78f);
        b.curveToRelative(0.0f, -1.12f, -0.61f, -2.15f, -1.61f, -2.66f);
        b.curveToRelative(-0.43f, -0.22f, -0.9f, -0.43f, -1.39f, -0.62f);
        uo.l(b, 17.0f, 22.0f, 12.34f, 17.0f);
        b.lineTo(15.0f, 11.33f);
        b.curveTo(14.07f, 11.12f, 13.07f, 11.0f, 12.0f, 11.0f);
        b.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        b.curveTo(4.61f, 13.07f, 4.0f, 14.1f, 4.0f, 15.22f);
        b.lineTo(4.0f, 22.0f);
        b.horizontalLineToRelative(2.34f);
        b.curveTo(6.12f, 21.55f, 6.0f, 21.04f, 6.0f, 20.5f);
        b.curveTo(6.0f, 18.57f, 7.57f, 17.0f, 9.5f, 17.0f);
        k4.w(b, 12.34f, 10.0f, 22.0f);
        b.lineToRelative(1.41f, -3.0f);
        b.horizontalLineTo(9.5f);
        b.curveTo(8.67f, 19.0f, 8.0f, 19.67f, 8.0f, 20.5f);
        b.reflectiveCurveTo(8.67f, 22.0f, 9.5f, 22.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personalInjury = build;
        build.getClass();
        return build;
    }
}
