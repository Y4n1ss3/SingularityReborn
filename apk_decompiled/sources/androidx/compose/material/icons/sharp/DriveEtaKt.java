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
import defpackage.af0;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DriveEtaKt {
    private static ImageVector _driveEta;

    public static final ImageVector getDriveEta(Icons.Sharp sharp) {
        ImageVector imageVector = _driveEta;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DriveEta", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.92f, 5.01f, 18.57f, 4.0f);
        i.lineTo(5.43f, 4.0f);
        af0.m(i, 3.0f, 11.0f, 9.0f, 3.0f);
        r6.D(i, -2.0f, 12.0f, 2.0f, 3.0f);
        uo.t(i, -9.0f, -2.08f, -5.99f);
        i.moveTo(6.5f, 15.0f);
        i.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        i.reflectiveCurveTo(5.67f, 12.0f, 6.5f, 12.0f);
        i.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        i.reflectiveCurveTo(7.33f, 15.0f, 6.5f, 15.0f);
        i.close();
        i.moveTo(17.5f, 15.0f);
        i.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        i.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        i.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        i.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        k4.x(i, 5.0f, 10.0f, 1.5f, -4.5f);
        i.horizontalLineToRelative(11.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 19.0f, 10.0f, 5.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _driveEta = build;
        build.getClass();
        return build;
    }
}
