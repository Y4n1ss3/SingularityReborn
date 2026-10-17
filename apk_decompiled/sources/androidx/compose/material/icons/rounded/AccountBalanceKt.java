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
import defpackage.af0;
import defpackage.bv;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AccountBalanceKt {
    private static ImageVector _accountBalance;

    public static final ImageVector getAccountBalance(Icons.Rounded rounded) {
        ImageVector imageVector = _accountBalance;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AccountBalance", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(4.0f, 11.5f, 4.0f);
        h.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        h.reflectiveCurveTo(7.0f, 16.33f, 7.0f, 15.5f);
        h.verticalLineToRelative(-4.0f);
        h.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        h.reflectiveCurveTo(4.0f, 10.67f, 4.0f, 11.5f);
        bv.v(h, 10.0f, 11.5f, 4.0f);
        h.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        h.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        h.verticalLineToRelative(-4.0f);
        h.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        h.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        af0.l(h, 3.5f, 22.0f, 16.0f);
        h.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        h.reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f);
        h.horizontalLineToRelative(-16.0f);
        h.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        h.reflectiveCurveTo(2.67f, 22.0f, 3.5f, 22.0f);
        bv.v(h, 16.0f, 11.5f, 4.0f);
        h.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        h.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        h.verticalLineToRelative(-4.0f);
        h.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        h.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        k4.x(h, 10.57f, 1.49f, -7.9f, 4.16f);
        h.curveToRelative(-0.41f, 0.21f, -0.67f, 0.64f, -0.67f, 1.1f);
        h.curveTo(2.0f, 7.44f, 2.56f, 8.0f, 3.25f, 8.0f);
        h.horizontalLineToRelative(16.51f);
        h.curveTo(20.44f, 8.0f, 21.0f, 7.44f, 21.0f, 6.75f);
        h.curveToRelative(0.0f, -0.46f, -0.26f, -0.89f, -0.67f, -1.1f);
        h.lineToRelative(-7.9f, -4.16f);
        h.curveToRelative(-0.58f, -0.31f, -1.28f, -0.31f, -1.86f, 0.0f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accountBalance = build;
        build.getClass();
        return build;
    }
}
