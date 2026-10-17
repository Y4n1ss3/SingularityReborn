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
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FontDownloadKt {
    private static ImageVector _fontDownload;

    public static final ImageVector getFontDownload(Icons.Sharp sharp) {
        ImageVector imageVector = _fontDownload;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FontDownload", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(9.93f, 13.5f, 4.14f, 12.0f, 7.98f);
        uo.l(p, 9.93f, 13.5f, 22.0f, 2.0f);
        af0.m(p, 2.0f, 2.0f, 20.0f, 20.0f);
        uo.l(p, 22.0f, 2.0f, 15.95f, 18.5f);
        p.lineToRelative(-1.14f, -3.0f);
        p.lineTo(9.17f, 15.5f);
        p.lineToRelative(-1.12f, 3.0f);
        p.lineTo(5.96f, 18.5f);
        p.lineToRelative(5.11f, -13.0f);
        p.horizontalLineToRelative(1.86f);
        p.lineToRelative(5.11f, 13.0f);
        p.horizontalLineToRelative(-2.09f);
        p.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, p.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fontDownload = build;
        build.getClass();
        return build;
    }
}
