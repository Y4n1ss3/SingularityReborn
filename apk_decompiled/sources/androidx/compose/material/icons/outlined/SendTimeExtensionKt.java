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
import defpackage.bv;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SendTimeExtensionKt {
    private static ImageVector _sendTimeExtension;

    public static final ImageVector getSendTimeExtension(Icons.Outlined outlined) {
        ImageVector imageVector = _sendTimeExtension;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SendTimeExtension", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(18.0f, 6.0f, 6.26f, 2.0f, 1.0f);
        n.verticalLineTo(6.0f);
        n.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        n.horizontalLineToRelative(-4.0f);
        n.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        n.reflectiveCurveTo(9.0f, 2.62f, 9.0f, 4.0f);
        n.horizontalLineTo(5.01f);
        n.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        n.verticalLineToRelative(3.8f);
        n.curveTo(5.7f, 9.8f, 6.0f, 11.96f, 6.0f, 12.5f);
        n.curveToRelative(0.0f, 0.54f, -0.29f, 2.7f, -3.0f, 2.7f);
        n.verticalLineTo(19.0f);
        n.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        n.horizontalLineToRelative(3.8f);
        n.curveToRelative(0.0f, -2.16f, 1.37f, -2.78f, 2.2f, -2.94f);
        n.verticalLineToRelative(-2.03f);
        n.curveTo(9.57f, 16.2f, 7.85f, 17.07f, 7.13f, 19.0f);
        n.horizontalLineTo(5.0f);
        n.verticalLineToRelative(-2.13f);
        n.curveToRelative(2.17f, -0.8f, 3.0f, -2.87f, 3.0f, -4.37f);
        n.curveToRelative(0.0f, -1.49f, -0.83f, -3.56f, -2.99f, -4.37f);
        uo.j(n, 6.0f, 11.0f, 4.0f);
        n.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        n.reflectiveCurveTo(12.0f, 3.72f, 12.0f, 4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.e(n, 2.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(13.0f, 12.0f, 0.0f, 4.0f);
        e.lineToRelative(4.0f, 1.0f);
        e.lineToRelative(-4.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 0.0f, 4.0f, 10.0f, -5.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sendTimeExtension = build;
        build.getClass();
        return build;
    }
}
