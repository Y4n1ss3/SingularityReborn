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
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BoltKt {
    private static ImageVector _bolt;

    public static final ImageVector getBolt(Icons.TwoTone twoTone) {
        ImageVector imageVector = _bolt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Bolt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(11.0f, 21.0f, -1.0f, 1.0f, -7.0f);
        i.horizontalLineTo(7.5f);
        i.curveToRelative(-0.88f, 0.0f, -0.33f, -0.75f, -0.31f, -0.78f);
        i.curveTo(8.48f, 10.94f, 10.42f, 7.54f, 13.01f, 3.0f);
        kf0.B(i, 1.0f, -1.0f, 7.0f, 3.51f);
        i.curveToRelative(0.4f, 0.0f, 0.62f, 0.19f, 0.4f, 0.66f);
        i.curveTo(12.97f, 17.55f, 11.0f, 21.0f, 11.0f, 21.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bolt = build;
        build.getClass();
        return build;
    }
}
