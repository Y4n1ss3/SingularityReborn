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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AccountBoxKt {
    private static ImageVector _accountBox;

    public static final ImageVector getAccountBox(Icons.Outlined outlined) {
        ImageVector imageVector = _accountBox;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AccountBox", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 3.0f, 5.0f);
        d.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        uo.q(d, 17.0f, 19.0f, 7.0f, -0.24f);
        d.curveTo(8.42f, 17.62f, 10.16f, 17.0f, 12.0f, 17.0f);
        d.reflectiveCurveToRelative(3.58f, 0.62f, 5.0f, 1.76f);
        bv.t(d, 19.0f, 19.0f, 17.86f);
        d.curveTo(17.2f, 16.09f, 14.73f, 15.0f, 12.0f, 15.0f);
        d.reflectiveCurveToRelative(-5.2f, 1.09f, -7.0f, 2.86f);
        c21.c(d, 5.0f, 14.0f, 17.86f);
        d.moveTo(12.0f, 13.0f);
        d.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        d.reflectiveCurveTo(13.93f, 6.0f, 12.0f, 6.0f);
        d.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        d.reflectiveCurveTo(10.07f, 13.0f, 12.0f, 13.0f);
        d.close();
        d.moveTo(12.0f, 8.0f);
        d.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        d.reflectiveCurveTo(12.83f, 11.0f, 12.0f, 11.0f);
        d.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(d, 11.17f, 8.0f, 12.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accountBox = build;
        build.getClass();
        return build;
    }
}
