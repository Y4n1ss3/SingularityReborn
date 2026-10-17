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
import defpackage.er;
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SendToMobileKt {
    private static ImageVector _sendToMobile;

    public static final ImageVector getSendToMobile(Icons.Rounded rounded) {
        ImageVector imageVector = _sendToMobile;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SendToMobile", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder f = k4.f(17.0f, 18.0f, 7.0f, 6.0f, 10.0f);
        f.verticalLineToRelative(0.0f);
        f.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        f.horizontalLineToRelative(0.0f);
        f.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        f.verticalLineTo(3.0f);
        f.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        f.lineTo(7.0f, 1.01f);
        f.curveTo(5.9f, 1.01f, 5.0f, 1.9f, 5.0f, 3.0f);
        f.verticalLineToRelative(18.0f);
        f.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        f.horizontalLineToRelative(10.0f);
        f.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        f.verticalLineToRelative(-3.0f);
        f.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        f.horizontalLineToRelative(0.0f);
        f.curveTo(17.45f, 17.0f, 17.0f, 17.45f, 17.0f, 18.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(f, 17.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.65f, 11.65f, -2.79f, -2.79f);
        e.curveTo(18.54f, 8.54f, 18.0f, 8.76f, 18.0f, 9.21f);
        e.verticalLineTo(11.0f);
        e.horizontalLineToRelative(-4.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.horizontalLineToRelative(4.0f);
        e.verticalLineToRelative(1.79f);
        e.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        e.lineToRelative(2.79f, -2.79f);
        e.curveTo(21.84f, 12.16f, 21.84f, 11.84f, 21.65f, 11.65f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sendToMobile = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getSendToMobile$annotations(Icons.Rounded rounded) {
    }
}
