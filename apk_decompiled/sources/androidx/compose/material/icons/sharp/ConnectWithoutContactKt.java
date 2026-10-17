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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ConnectWithoutContactKt {
    private static ImageVector _connectWithoutContact;

    public static final ImageVector getConnectWithoutContact(Icons.Sharp sharp) {
        ImageVector imageVector = _connectWithoutContact;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ConnectWithoutContact", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(11.0f, 14.0f, 9.0f);
        d.curveToRelative(0.0f, -4.97f, 4.03f, -9.0f, 9.0f, -9.0f);
        d.verticalLineToRelative(2.0f);
        d.curveTo(14.13f, 7.0f, 11.0f, 10.13f, 11.0f, 14.0f);
        bv.g(d, 18.0f, 11.0f, 9.0f);
        d.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        d.horizontalLineToRelative(2.0f);
        d.curveTo(15.0f, 12.34f, 16.34f, 11.0f, 18.0f, 11.0f);
        d.close();
        d.moveTo(7.0f, 4.0f);
        d.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        d.reflectiveCurveTo(3.0f, 2.89f, 3.0f, 4.0f);
        d.reflectiveCurveToRelative(0.89f, 2.0f, 2.0f, 2.0f);
        d.reflectiveCurveTo(7.0f, 5.11f, 7.0f, 4.0f);
        af0.l(d, 11.45f, 4.5f, -2.0f);
        d.curveTo(9.21f, 5.92f, 7.99f, 7.0f, 6.5f, 7.0f);
        af0.g(d, 2.0f, 4.0f, 6.0f, 8.74f);
        d.curveTo(9.86f, 8.15f, 11.25f, 6.51f, 11.45f, 4.5f);
        d.close();
        d.moveTo(19.0f, 17.0f);
        d.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        d.reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f);
        d.reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f);
        d.reflectiveCurveTo(17.89f, 17.0f, 19.0f, 17.0f);
        d.close();
        d.moveTo(17.5f, 18.0f);
        d.curveToRelative(-1.49f, 0.0f, -2.71f, -1.08f, -2.95f, -2.5f);
        d.horizontalLineToRelative(-2.0f);
        d.curveToRelative(0.2f, 2.01f, 1.59f, 3.65f, 3.45f, 4.24f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.p(d, 22.0f, 6.0f, -4.0f, 17.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _connectWithoutContact = build;
        build.getClass();
        return build;
    }
}
