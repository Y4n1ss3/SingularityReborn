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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwitchAccountKt {
    private static ImageVector _switchAccount;

    public static final ImageVector getSwitchAccount(Icons.Outlined outlined) {
        ImageVector imageVector = _switchAccount;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SwitchAccount", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = j50.q(4.0f, 6.0f, 2.0f, 14.0f);
        q.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gy.t(q, 14.0f, -2.0f, 4.0f, 6.0f);
        q.moveTo(14.0f, 11.0f);
        q.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        q.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        q.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        q.curveTo(11.0f, 9.66f, 12.34f, 11.0f, 14.0f, 11.0f);
        q.close();
        q.moveTo(14.0f, 7.0f);
        q.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        q.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        q.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        q.reflectiveCurveTo(13.45f, 7.0f, 14.0f, 7.0f);
        r6.g(q, 20.0f, 2.0f, 8.0f);
        q.curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f);
        q.verticalLineToRelative(12.0f);
        q.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        q.horizontalLineToRelative(12.0f);
        q.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        q.verticalLineTo(4.0f);
        q.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        q.close();
        q.moveTo(10.69f, 16.0f);
        q.curveToRelative(0.95f, -0.63f, 2.09f, -1.0f, 3.31f, -1.0f);
        q.reflectiveCurveToRelative(2.36f, 0.37f, 3.31f, 1.0f);
        k4.w(q, 10.69f, 20.0f, 15.73f);
        q.curveTo(18.53f, 14.06f, 16.4f, 13.0f, 14.0f, 13.0f);
        q.reflectiveCurveToRelative(-4.53f, 1.06f, -6.0f, 2.73f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.r(q, 4.0f, 12.0f, 15.73f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _switchAccount = build;
        build.getClass();
        return build;
    }
}
