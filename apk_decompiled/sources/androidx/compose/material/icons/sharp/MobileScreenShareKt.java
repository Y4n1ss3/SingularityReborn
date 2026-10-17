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
import defpackage.er;
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MobileScreenShareKt {
    private static ImageVector _mobileScreenShare;

    public static final ImageVector getMobileScreenShare(Icons.Sharp sharp) {
        ImageVector imageVector = _mobileScreenShare;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MobileScreenShare", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(5.01f, 1.0f, 22.0f, 19.0f, 23.0f);
        r6.C(y, 19.0f, 1.0f, 5.01f, 1.0f);
        y.moveTo(17.0f, 19.0f);
        y.lineTo(7.0f, 19.0f);
        r6.m(y, 7.0f, 5.0f, 10.0f, 14.0f);
        y.moveTo(12.8f, 13.24f);
        y.verticalLineToRelative(1.75f);
        y.lineTo(16.0f, 12.0f);
        y.lineToRelative(-3.2f, -2.98f);
        y.verticalLineToRelative(1.7f);
        y.curveToRelative(-3.11f, 0.43f, -4.35f, 2.56f, -4.8f, 4.7f);
        y.curveToRelative(1.11f, -1.5f, 2.58f, -2.18f, 4.8f, -2.18f);
        y.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, y.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mobileScreenShare = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getMobileScreenShare$annotations(Icons.Sharp sharp) {
    }
}
