package androidx.compose.material.icons.automirrored.outlined;

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
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StopScreenShareKt {
    private static ImageVector _stopScreenShare;

    public static final ImageVector getStopScreenShare(Icons.AutoMirrored.Outlined outlined) {
        ImageVector imageVector = _stopScreenShare;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Outlined.StopScreenShare", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.79f, 18.0f, 2.0f, 2.0f);
        kp0.x(e, 24.0f, 20.0f, -2.0f, -2.21f);
        e.moveTo(1.11f, 2.98f);
        e.lineToRelative(1.55f, 1.56f);
        e.curveToRelative(-0.41f, 0.37f, -0.66f, 0.89f, -0.66f, 1.48f);
        e.lineTo(2.0f, 16.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.01f, 2.0f);
        af0.m(e, 0.0f, 18.0f, 2.0f, 18.13f);
        e.lineToRelative(2.71f, 2.71f);
        e.lineToRelative(1.41f, -1.41f);
        r6.C(e, 2.52f, 1.57f, 1.11f, 2.98f);
        e.moveTo(4.0f, 6.02f);
        e.horizontalLineToRelative(0.13f);
        e.lineToRelative(4.95f, 4.93f);
        e.curveTo(7.94f, 12.07f, 7.31f, 13.52f, 7.0f, 15.0f);
        e.curveToRelative(0.96f, -1.29f, 2.13f, -2.08f, 3.67f, -2.46f);
        e.lineToRelative(3.46f, 3.48f);
        bv.r(e, 4.0f, 16.02f, -10.0f);
        e.moveTo(20.0f, 6.02f);
        e.verticalLineToRelative(10.19f);
        e.lineToRelative(1.3f, 1.3f);
        e.curveToRelative(0.42f, -0.37f, 0.7f, -0.89f, 0.7f, -1.49f);
        e.verticalLineToRelative(-10.0f);
        e.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.lineTo(7.8f, 4.02f);
        gy.B(e, 2.0f, 2.0f, 20.0f, 6.02f);
        e.moveTo(12.93f, 9.15f);
        e.lineToRelative(2.79f, 2.78f);
        e.lineToRelative(1.28f, -1.2f);
        e.lineTo(13.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.o(e, 2.13f, -0.07f, 0.02f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stopScreenShare = build;
        build.getClass();
        return build;
    }
}
