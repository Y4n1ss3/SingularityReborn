package androidx.compose.material.icons.rounded;

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
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MedicalInformationKt {
    private static ImageVector _medicalInformation;

    public static final ImageVector getMedicalInformation(Icons.Rounded rounded) {
        ImageVector imageVector = _medicalInformation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MedicalInformation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = j50.e(20.0f, 7.0f, -5.0f, 4.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.horizontalLineToRelative(-2.0f);
        e.curveTo(9.9f, 2.0f, 9.0f, 2.9f, 9.0f, 4.0f);
        e.verticalLineToRelative(3.0f);
        e.horizontalLineTo(4.0f);
        e.curveTo(2.9f, 7.0f, 2.0f, 7.9f, 2.0f, 9.0f);
        e.verticalLineToRelative(11.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(16.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineTo(9.0f);
        e.curveTo(22.0f, 7.9f, 21.1f, 7.0f, 20.0f, 7.0f);
        r6.B(e, 11.0f, 4.0f, 2.0f, 5.0f);
        uo.r(e, -2.0f, 4.0f, 7.0f, 16.0f);
        e.horizontalLineTo(6.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        e.horizontalLineToRelative(1.0f);
        e.verticalLineToRelative(-1.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        e.verticalLineToRelative(1.0f);
        e.horizontalLineToRelative(1.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        e.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        e.horizontalLineTo(9.0f);
        e.verticalLineToRelative(1.0f);
        e.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        e.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        bv.t(e, 16.0f, 13.75f, 14.5f);
        e.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        e.reflectiveCurveTo(13.34f, 13.0f, 13.75f, 13.0f);
        e.horizontalLineToRelative(4.5f);
        e.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        e.reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f);
        k4.w(e, 13.75f, 13.75f, 17.5f);
        e.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        e.reflectiveCurveTo(13.34f, 16.0f, 13.75f, 16.0f);
        e.horizontalLineToRelative(2.5f);
        e.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        e.reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(e, 13.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _medicalInformation = build;
        build.getClass();
        return build;
    }
}
