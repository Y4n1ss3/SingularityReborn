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
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransferWithinAStationKt {
    private static ImageVector _transferWithinAStation;

    public static final ImageVector getTransferWithinAStation(Icons.Outlined outlined) {
        ImageVector imageVector = _transferWithinAStation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.TransferWithinAStation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(16.49f, 15.5f, -1.75f, 14.0f, 16.25f);
        y.lineToRelative(2.49f, 2.5f);
        y.lineTo(16.49f, 17.0f);
        kp0.x(y, 22.0f, 17.0f, -1.5f, -5.51f);
        y.moveTo(19.51f, 19.75f);
        af0.m(y, 14.0f, 19.75f, 1.5f, 5.51f);
        y.lineTo(19.51f, 23.0f);
        y.lineTo(22.0f, 20.5f);
        bv.r(y, 19.51f, 18.0f, 1.75f);
        y.moveTo(9.5f, 5.5f);
        y.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        y.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        y.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        y.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        k4.r(y, 5.75f, 8.9f, 3.0f, 23.0f);
        y.horizontalLineToRelative(2.1f);
        y.lineToRelative(1.75f, -8.0f);
        af0.m(y, 9.0f, 17.0f, 6.0f, 2.0f);
        y.verticalLineToRelative(-7.55f);
        y.lineTo(8.95f, 13.4f);
        y.lineToRelative(0.6f, -3.0f);
        y.curveTo(10.85f, 12.0f, 12.8f, 13.0f, 15.0f, 13.0f);
        y.verticalLineToRelative(-2.0f);
        y.curveToRelative(-1.85f, 0.0f, -3.45f, -1.0f, -4.35f, -2.45f);
        y.lineToRelative(-0.95f, -1.6f);
        y.curveTo(9.35f, 6.35f, 8.7f, 6.0f, 8.0f, 6.0f);
        y.curveToRelative(-0.25f, 0.0f, -0.5f, 0.05f, -0.75f, 0.15f);
        y.lineTo(2.0f, 8.3f);
        y.lineTo(2.0f, 13.0f);
        y.horizontalLineToRelative(2.0f);
        y.lineTo(4.0f, 9.65f);
        y.lineToRelative(1.75f, -0.75f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, y.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _transferWithinAStation = build;
        build.getClass();
        return build;
    }
}
