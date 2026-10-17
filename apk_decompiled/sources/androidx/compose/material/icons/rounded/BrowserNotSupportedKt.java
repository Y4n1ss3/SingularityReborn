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
import defpackage.c21;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BrowserNotSupportedKt {
    private static ImageVector _browserNotSupported;

    public static final ImageVector getBrowserNotSupported(Icons.Rounded rounded) {
        ImageVector imageVector = _browserNotSupported;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BrowserNotSupported", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(19.0f, 6.0f, 10.5f, 1.95f, 1.95f);
        n.curveTo(20.98f, 18.3f, 21.0f, 18.15f, 21.0f, 18.0f);
        n.verticalLineTo(6.0f);
        n.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        n.horizontalLineTo(6.5f);
        n.lineToRelative(2.0f, 2.0f);
        n.horizontalLineTo(19.0f);
        n.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(3.86f, 3.95f);
        b.curveToRelative(-0.35f, -0.35f, -0.92f, -0.35f, -1.27f, 0.0f);
        b.curveToRelative(-0.35f, 0.35f, -0.35f, 0.92f, 0.0f, 1.27f);
        b.lineTo(3.0f, 5.64f);
        b.lineTo(3.0f, 18.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(12.36f);
        b.lineToRelative(1.42f, 1.42f);
        b.curveToRelative(0.35f, 0.35f, 0.92f, 0.35f, 1.27f, 0.0f);
        b.curveToRelative(0.35f, -0.35f, 0.35f, -0.92f, 0.0f, -1.27f);
        uo.l(b, 3.86f, 3.95f, 5.0f, 18.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c21.b(b, 7.64f, 15.36f, 18.0f, 5.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _browserNotSupported = build;
        build.getClass();
        return build;
    }
}
