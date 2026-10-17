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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HeartBrokenKt {
    private static ImageVector _heartBroken;

    public static final ImageVector getHeartBroken(Icons.Sharp sharp) {
        ImageVector imageVector = _heartBroken;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.HeartBroken", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.5f, 3.0f);
        b.curveToRelative(-0.96f, 0.0f, -1.9f, 0.25f, -2.73f, 0.69f);
        b.lineTo(12.0f, 9.0f);
        b.horizontalLineToRelative(3.0f);
        b.lineToRelative(-3.0f, 10.0f);
        b.lineToRelative(1.0f, -9.0f);
        b.horizontalLineToRelative(-3.0f);
        b.lineToRelative(1.54f, -5.39f);
        b.curveTo(10.47f, 3.61f, 9.01f, 3.0f, 7.5f, 3.0f);
        b.curveTo(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f);
        b.curveToRelative(0.0f, 4.13f, 4.16f, 7.18f, 10.0f, 12.5f);
        b.curveToRelative(5.47f, -4.94f, 10.0f, -8.26f, 10.0f, -12.5f);
        b.curveTo(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _heartBroken = build;
        build.getClass();
        return build;
    }
}
