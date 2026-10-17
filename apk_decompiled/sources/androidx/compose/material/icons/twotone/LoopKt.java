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
public final class LoopKt {
    private static ImageVector _loop;

    public static final ImageVector getLoop(Icons.TwoTone twoTone) {
        ImageVector imageVector = _loop;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Loop", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 18.0f);
        b.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        b.curveToRelative(0.0f, -1.01f, 0.25f, -1.97f, 0.7f, -2.8f);
        b.lineTo(5.24f, 7.74f);
        b.curveTo(4.46f, 8.97f, 4.0f, 10.43f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        b.verticalLineToRelative(3.0f);
        b.lineToRelative(4.0f, -4.0f);
        uf.v(b, -4.0f, -4.0f, 3.0f);
        b.moveTo(12.0f, 4.0f);
        b.lineTo(12.0f, 1.0f);
        b.lineTo(8.0f, 5.0f);
        b.lineToRelative(4.0f, 4.0f);
        b.lineTo(12.0f, 6.0f);
        b.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        b.curveToRelative(0.0f, 1.01f, -0.25f, 1.97f, -0.7f, 2.8f);
        b.lineToRelative(1.46f, 1.46f);
        b.curveTo(19.54f, 15.03f, 20.0f, 13.57f, 20.0f, 12.0f);
        b.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _loop = build;
        build.getClass();
        return build;
    }
}
