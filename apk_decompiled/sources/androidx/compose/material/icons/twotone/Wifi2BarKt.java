package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Wifi2BarKt {
    private static ImageVector _wifi2Bar;

    public static final ImageVector getWifi2Bar(Icons.TwoTone twoTone) {
        ImageVector imageVector = _wifi2Bar;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Wifi2Bar", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 10.0f);
        b.curveToRelative(3.03f, 0.0f, 5.78f, 1.23f, 7.76f, 3.22f);
        b.lineToRelative(-2.12f, 2.12f);
        b.curveTo(16.2f, 13.9f, 14.2f, 13.0f, 12.0f, 13.0f);
        b.curveToRelative(-2.2f, 0.0f, -4.2f, 0.9f, -5.64f, 2.35f);
        b.lineToRelative(-2.12f, -2.12f);
        b.curveTo(6.22f, 11.23f, 8.97f, 10.0f, 12.0f, 10.0f);
        b.close();
        b.moveTo(12.0f, 16.0f);
        b.curveToRelative(-1.38f, 0.0f, -2.63f, 0.56f, -3.53f, 1.46f);
        b.lineTo(12.0f, 21.0f);
        b.lineToRelative(3.53f, -3.54f);
        b.curveTo(14.63f, 16.56f, 13.38f, 16.0f, 12.0f, 16.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wifi2Bar = build;
        build.getClass();
        return build;
    }
}
