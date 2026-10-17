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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FontDownloadOffKt {
    private static ImageVector _fontDownloadOff;

    public static final ImageVector getFontDownloadOff(Icons.Outlined outlined) {
        ImageVector imageVector = _fontDownloadOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FontDownloadOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(4.83f, 2.0f, 20.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        k4.z(d, 15.17f, -2.0f, -2.0f, 4.0f);
        kf0.m(d, 6.83f, 4.83f, 2.0f);
        d.moveTo(10.92f, 6.0f);
        d.lineToRelative(-0.57f, 1.52f);
        d.lineToRelative(1.36f, 1.36f);
        d.lineToRelative(0.23f, -0.66f);
        d.horizontalLineToRelative(0.1f);
        d.lineToRelative(0.54f, 1.52f);
        d.lineToRelative(3.04f, 3.04f);
        kf0.h(d, 13.07f, 6.0f, 10.92f);
        d.moveTo(20.49f, 23.31f);
        d.lineTo(19.17f, 22.0f);
        d.horizontalLineTo(4.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        d.verticalLineTo(4.83f);
        d.lineTo(0.69f, 3.51f);
        d.lineTo(2.1f, 2.1f);
        gy.B(d, 19.8f, 19.8f, 20.49f, 23.31f);
        d.moveTo(17.17f, 20.0f);
        d.lineToRelative(-5.07f, -5.07f);
        bv.u(d, 9.58f, 8.49f, 18.0f, 6.41f);
        d.lineToRelative(2.39f, -6.37f);
        d.lineTo(4.0f, 6.83f);
        d.verticalLineTo(20.0f);
        d.horizontalLineTo(17.17f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fontDownloadOff = build;
        build.getClass();
        return build;
    }
}
