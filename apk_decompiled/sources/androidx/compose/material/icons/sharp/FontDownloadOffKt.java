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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FontDownloadOffKt {
    private static ImageVector _fontDownloadOff;

    public static final ImageVector getFontDownloadOff(Icons.Sharp sharp) {
        ImageVector imageVector = _fontDownloadOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FontDownloadOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.58f, 9.75f, -0.87f, -0.87f);
        e.lineToRelative(0.23f, -0.66f);
        gy.n(e, 0.1f, 12.58f, 9.75f);
        e.moveTo(20.49f, 23.31f);
        fc.v(e, 19.17f, 22.0f, 2.0f, 4.83f);
        e.lineTo(0.69f, 3.51f);
        e.lineTo(2.1f, 2.1f);
        gy.B(e, 19.8f, 19.8f, 20.49f, 23.31f);
        e.moveTo(12.1f, 14.93f);
        e.lineToRelative(-3.3f, -3.3f);
        e.lineTo(6.41f, 18.0f);
        uf.A(e, 2.08f, 1.09f, -3.07f, 12.1f);
        e.moveTo(10.35f, 7.52f);
        e.lineTo(10.92f, 6.0f);
        e.horizontalLineToRelative(2.14f);
        e.lineToRelative(2.55f, 6.79f);
        uf.u(e, 22.0f, 19.17f, 2.0f, 4.83f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 10.35f, 7.52f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fontDownloadOff = build;
        build.getClass();
        return build;
    }
}
