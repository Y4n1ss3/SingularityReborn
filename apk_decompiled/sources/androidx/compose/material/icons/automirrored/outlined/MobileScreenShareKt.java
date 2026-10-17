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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MobileScreenShareKt {
    private static ImageVector _mobileScreenShare;

    public static final ImageVector getMobileScreenShare(Icons.AutoMirrored.Outlined outlined) {
        ImageVector imageVector = _mobileScreenShare;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Outlined.MobileScreenShare", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.0f, 1.0f, 7.0f, 1.0f);
        i.curveToRelative(-1.1f, 0.0f, -1.99f, 0.85f, -1.99f, 1.95f);
        i.verticalLineToRelative(18.0f);
        i.curveTo(5.01f, 22.05f, 5.9f, 23.0f, 7.0f, 23.0f);
        i.horizontalLineToRelative(10.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.95f, 2.0f, -2.05f);
        i.verticalLineToRelative(-18.0f);
        i.curveTo(19.0f, 1.85f, 18.1f, 1.0f, 17.0f, 1.0f);
        k4.r(i, 17.0f, 19.0f, 7.0f, 19.0f);
        r6.m(i, 7.0f, 5.0f, 10.0f, 14.0f);
        i.moveTo(12.8f, 13.24f);
        i.verticalLineToRelative(1.75f);
        i.lineTo(16.0f, 12.0f);
        i.lineToRelative(-3.2f, -2.98f);
        i.verticalLineToRelative(1.7f);
        i.curveToRelative(-3.11f, 0.43f, -4.35f, 2.56f, -4.8f, 4.7f);
        i.curveToRelative(1.11f, -1.5f, 2.58f, -2.18f, 4.8f, -2.18f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mobileScreenShare = build;
        build.getClass();
        return build;
    }
}
