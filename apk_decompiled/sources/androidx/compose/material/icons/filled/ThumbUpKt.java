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
import defpackage.bv;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThumbUpKt {
    private static ImageVector _thumbUp;

    public static final ImageVector getThumbUp(Icons.Filled filled) {
        ImageVector imageVector = _thumbUp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ThumbUp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(1.0f, 21.0f, 4.0f, 5.0f, 9.0f);
        bv.r(p, 1.0f, 9.0f, 12.0f);
        p.moveTo(23.0f, 10.0f);
        p.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        p.horizontalLineToRelative(-6.31f);
        p.lineToRelative(0.95f, -4.57f);
        p.lineToRelative(0.03f, -0.32f);
        p.curveToRelative(0.0f, -0.41f, -0.17f, -0.79f, -0.44f, -1.06f);
        p.lineTo(14.17f, 1.0f);
        p.lineTo(7.59f, 7.59f);
        p.curveTo(7.22f, 7.95f, 7.0f, 8.45f, 7.0f, 9.0f);
        p.verticalLineToRelative(10.0f);
        p.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p.horizontalLineToRelative(9.0f);
        p.curveToRelative(0.83f, 0.0f, 1.54f, -0.5f, 1.84f, -1.22f);
        p.lineToRelative(3.02f, -7.05f);
        p.curveToRelative(0.09f, -0.23f, 0.14f, -0.47f, 0.14f, -0.73f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(p, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbUp = build;
        build.getClass();
        return build;
    }
}
