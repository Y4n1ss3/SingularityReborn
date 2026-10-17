package androidx.compose.material.icons.automirrored.twotone;

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
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MobileScreenShareKt {
    private static ImageVector _mobileScreenShare;

    public static final ImageVector getMobileScreenShare(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _mobileScreenShare;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.MobileScreenShare", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(7.0f, 19.0f, 10.0f, 17.0f, 5.0f);
        bv.r(p, 7.0f, 5.0f, 14.0f);
        p.moveTo(12.8f, 10.72f);
        p.verticalLineToRelative(-1.7f);
        p.lineTo(16.0f, 12.0f);
        p.lineToRelative(-3.2f, 2.99f);
        p.verticalLineToRelative(-1.75f);
        p.curveToRelative(-2.22f, 0.0f, -3.69f, 0.68f, -4.8f, 2.18f);
        p.curveToRelative(0.45f, -2.14f, 1.69f, -4.27f, 4.8f, -4.7f);
        p.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, p.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.0f, 1.0f, 7.0f, 1.0f);
        i.curveToRelative(-1.1f, 0.0f, -1.99f, 0.85f, -1.99f, 1.95f);
        i.verticalLineToRelative(18.0f);
        i.curveTo(5.01f, 22.05f, 5.9f, 23.0f, 7.0f, 23.0f);
        i.horizontalLineToRelative(10.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.95f, 2.0f, -2.05f);
        i.lineTo(19.0f, 3.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
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
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mobileScreenShare = build;
        build.getClass();
        return build;
    }
}
