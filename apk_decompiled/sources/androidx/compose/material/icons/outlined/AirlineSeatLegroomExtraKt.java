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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirlineSeatLegroomExtraKt {
    private static ImageVector _airlineSeatLegroomExtra;

    public static final ImageVector getAirlineSeatLegroomExtra(Icons.Outlined outlined) {
        ImageVector imageVector = _airlineSeatLegroomExtra;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AirlineSeatLegroomExtra", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(4.0f, 12.0f, 4.0f, 3.0f);
        i.lineTo(2.0f, 3.0f);
        i.verticalLineToRelative(9.0f);
        i.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        bv.C(i, 6.0f, -2.0f, 7.0f, 15.0f);
        i.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        i.close();
        i.moveTo(22.83f, 17.24f);
        i.curveToRelative(-0.38f, -0.72f, -1.29f, -0.97f, -2.03f, -0.63f);
        i.lineToRelative(-1.09f, 0.5f);
        i.lineToRelative(-3.41f, -6.98f);
        i.curveTo(15.96f, 9.45f, 15.27f, 9.0f, 14.51f, 9.0f);
        i.lineTo(11.0f, 9.0f);
        i.lineTo(11.0f, 3.0f);
        i.lineTo(5.0f, 3.0f);
        i.verticalLineToRelative(8.0f);
        i.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        i.horizontalLineToRelative(7.0f);
        i.lineToRelative(3.41f, 7.0f);
        i.lineToRelative(3.72f, -1.7f);
        i.curveToRelative(0.77f, -0.36f, 1.1f, -1.3f, 0.7f, -2.06f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatLegroomExtra = build;
        build.getClass();
        return build;
    }
}
