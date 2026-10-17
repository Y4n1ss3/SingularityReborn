package androidx.compose.material.icons.twotone;

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
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransferWithinAStationKt {
    private static ImageVector _transferWithinAStation;

    public static final ImageVector getTransferWithinAStation(Icons.TwoTone twoTone) {
        ImageVector imageVector = _transferWithinAStation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.TransferWithinAStation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(16.49f, 13.75f, 14.0f, 16.25f);
        i.lineToRelative(2.49f, 2.5f);
        i.lineTo(16.49f, 17.0f);
        kp0.x(i, 22.0f, 17.0f, -1.5f, -5.51f);
        i.moveTo(19.51f, 19.75f);
        af0.m(i, 14.0f, 19.75f, 1.5f, 5.51f);
        i.lineTo(19.51f, 23.0f);
        r6.C(i, 22.0f, 20.5f, 19.51f, 18.0f);
        i.moveTo(7.5f, 3.5f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        i.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        i.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        i.close();
        i.moveTo(9.55f, 10.4f);
        i.curveTo(10.85f, 12.0f, 12.8f, 13.0f, 15.0f, 13.0f);
        i.verticalLineToRelative(-2.0f);
        i.curveToRelative(-1.85f, 0.0f, -3.45f, -1.0f, -4.35f, -2.45f);
        i.lineToRelative(-0.95f, -1.6f);
        i.curveTo(9.35f, 6.35f, 8.7f, 6.0f, 8.0f, 6.0f);
        i.curveToRelative(-0.25f, 0.0f, -0.5f, 0.05f, -0.75f, 0.15f);
        i.lineTo(2.0f, 8.3f);
        i.lineTo(2.0f, 13.0f);
        i.horizontalLineToRelative(2.0f);
        i.lineTo(4.0f, 9.65f);
        i.lineToRelative(1.75f, -0.75f);
        i.lineTo(3.0f, 23.0f);
        i.horizontalLineToRelative(2.1f);
        i.lineToRelative(1.75f, -8.0f);
        af0.m(i, 9.0f, 17.0f, 6.0f, 2.0f);
        i.verticalLineToRelative(-7.55f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(i, 8.95f, 13.4f, 0.6f, -3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _transferWithinAStation = build;
        build.getClass();
        return build;
    }
}
