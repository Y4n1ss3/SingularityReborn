package androidx.compose.material.icons.filled;

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
public final class RecommendKt {
    private static ImageVector _recommend;

    public static final ImageVector getRecommend(Icons.Filled filled) {
        ImageVector imageVector = _recommend;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Recommend", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        b.arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f);
        b.close();
        b.moveTo(18.0f, 11.8f);
        b.arcToRelative(0.9f, 0.9f, 0.0f, false, true, -0.1f, 0.5f);
        b.lineToRelative(-2.1f, 4.9f);
        b.arcToRelative(1.34f, 1.34f, 0.0f, false, true, -1.3f, 0.8f);
        b.lineTo(9.0f, 18.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        b.verticalLineToRelative(-5.0f);
        b.arcToRelative(1.28f, 1.28f, 0.0f, false, true, 0.4f, -1.0f);
        b.lineTo(12.0f, 5.0f);
        b.lineToRelative(0.69f, 0.69f);
        b.arcToRelative(1.08f, 1.08f, 0.0f, false, true, 0.3f, 0.7f);
        b.verticalLineToRelative(0.2f);
        b.lineTo(12.41f, 10.0f);
        b.lineTo(17.0f, 10.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _recommend = build;
        build.getClass();
        return build;
    }
}
