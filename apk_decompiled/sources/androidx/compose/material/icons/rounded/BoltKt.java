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
import defpackage.af0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BoltKt {
    private static ImageVector _bolt;

    public static final ImageVector getBolt(Icons.Rounded rounded) {
        ImageVector imageVector = _bolt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Bolt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(10.67f, 21.0f, 10.67f, 21.0f);
        i.curveToRelative(-0.35f, 0.0f, -0.62f, -0.31f, -0.57f, -0.66f);
        i.lineTo(11.0f, 14.0f);
        i.horizontalLineTo(7.5f);
        i.curveToRelative(-0.88f, 0.0f, -0.33f, -0.75f, -0.31f, -0.78f);
        i.curveToRelative(1.26f, -2.23f, 3.15f, -5.53f, 5.65f, -9.93f);
        i.curveToRelative(0.1f, -0.18f, 0.3f, -0.29f, 0.5f, -0.29f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(0.35f, 0.0f, 0.62f, 0.31f, 0.57f, 0.66f);
        i.lineTo(13.01f, 10.0f);
        i.horizontalLineToRelative(3.51f);
        i.curveToRelative(0.4f, 0.0f, 0.62f, 0.19f, 0.4f, 0.66f);
        i.curveToRelative(-3.29f, 5.74f, -5.2f, 9.09f, -5.75f, 10.05f);
        i.curveTo(11.07f, 20.89f, 10.88f, 21.0f, 10.67f, 21.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bolt = build;
        build.getClass();
        return build;
    }
}
