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
import defpackage.er;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StopScreenShareKt {
    private static ImageVector _stopScreenShare;

    public static final ImageVector getStopScreenShare(Icons.Sharp sharp) {
        ImageVector imageVector = _stopScreenShare;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.StopScreenShare", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.79f, 18.0f, 2.0f, 2.0f);
        bv.r(e, 24.0f, 20.0f, -2.0f);
        e.moveTo(13.0f, 9.13f);
        e.lineTo(13.0f, 7.0f);
        e.lineToRelative(4.0f, 3.74f);
        e.lineToRelative(-1.28f, 1.19f);
        e.lineToRelative(5.18f, 5.18f);
        e.lineTo(22.0f, 16.0f);
        e.lineTo(22.0f, 4.02f);
        e.lineTo(7.8f, 4.02f);
        e.lineToRelative(5.13f, 5.13f);
        e.curveToRelative(0.03f, -0.01f, 0.05f, -0.02f, 0.07f, -0.02f);
        k4.x(e, 1.11f, 2.98f, 0.89f, 0.9f);
        e.verticalLineToRelative(12.14f);
        e.lineToRelative(2.0f, 1.99f);
        af0.m(e, 0.0f, 18.0f, 2.0f, 18.13f);
        e.lineToRelative(2.71f, 2.71f);
        e.lineToRelative(1.41f, -1.41f);
        r6.C(e, 2.52f, 1.57f, 1.11f, 2.98f);
        e.moveTo(9.08f, 10.95f);
        e.lineToRelative(1.59f, 1.59f);
        e.curveTo(9.13f, 12.92f, 7.96f, 13.71f, 7.0f, 15.0f);
        e.curveToRelative(0.31f, -1.48f, 0.94f, -2.93f, 2.08f, -4.05f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stopScreenShare = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getStopScreenShare$annotations(Icons.Sharp sharp) {
    }
}
