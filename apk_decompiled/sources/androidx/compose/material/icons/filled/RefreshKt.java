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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RefreshKt {
    private static ImageVector _refresh;

    public static final ImageVector getRefresh(Icons.Filled filled) {
        ImageVector imageVector = _refresh;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Refresh", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.65f, 6.35f);
        b.curveTo(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        b.curveToRelative(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        b.reflectiveCurveToRelative(3.57f, 8.0f, 7.99f, 8.0f);
        b.curveToRelative(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        b.horizontalLineToRelative(-2.08f);
        b.curveToRelative(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        b.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        b.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        b.curveToRelative(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        kf0.y(b, 13.0f, 11.0f, 7.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(b, -2.35f, 2.35f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _refresh = build;
        build.getClass();
        return build;
    }
}
