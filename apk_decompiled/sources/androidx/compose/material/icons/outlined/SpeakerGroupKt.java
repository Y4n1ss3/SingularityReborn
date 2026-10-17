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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SpeakerGroupKt {
    private static ImageVector _speakerGroup;

    public static final ImageVector getSpeakerGroup(Icons.Outlined outlined) {
        ImageVector imageVector = _speakerGroup;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SpeakerGroup", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.2f, 1.0f, 9.8f, 1.0f);
        i.curveTo(8.81f, 1.0f, 8.0f, 1.81f, 8.0f, 2.8f);
        i.verticalLineToRelative(14.4f);
        i.curveToRelative(0.0f, 0.99f, 0.81f, 1.79f, 1.8f, 1.79f);
        i.lineToRelative(8.4f, 0.01f);
        i.curveToRelative(0.99f, 0.0f, 1.8f, -0.81f, 1.8f, -1.8f);
        i.lineTo(20.0f, 2.8f);
        i.curveToRelative(0.0f, -0.99f, -0.81f, -1.8f, -1.8f, -1.8f);
        k4.x(i, 18.0f, 17.0f, -8.0f, -0.01f);
        r6.m(i, 10.0f, 3.0f, 8.0f, 14.0f);
        i.moveTo(14.0f, 8.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        i.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        i.reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f);
        i.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        i.close();
        i.moveTo(14.0f, 16.0f);
        i.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        i.reflectiveCurveTo(15.93f, 9.0f, 14.0f, 9.0f);
        i.reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f);
        i.reflectiveCurveTo(12.07f, 16.0f, 14.0f, 16.0f);
        i.close();
        i.moveTo(14.0f, 11.0f);
        i.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        i.reflectiveCurveTo(14.83f, 14.0f, 14.0f, 14.0f);
        i.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        i.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        k4.r(i, 6.0f, 5.0f, 4.0f, 5.0f);
        i.verticalLineToRelative(16.0f);
        i.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        bv.C(i, 10.0f, -2.0f, 6.0f, 21.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 6.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _speakerGroup = build;
        build.getClass();
        return build;
    }
}
