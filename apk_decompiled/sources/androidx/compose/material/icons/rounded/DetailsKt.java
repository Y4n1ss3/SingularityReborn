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
import defpackage.bv;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DetailsKt {
    private static ImageVector _details;

    public static final ImageVector getDetails(Icons.Rounded rounded) {
        ImageVector imageVector = _details;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Details", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(11.13f, 4.57f, -8.3f, 14.94f);
        e.curveTo(2.46f, 20.18f, 2.94f, 21.0f, 3.7f, 21.0f);
        e.horizontalLineToRelative(16.6f);
        e.curveToRelative(0.76f, 0.0f, 1.24f, -0.82f, 0.87f, -1.49f);
        e.lineToRelative(-8.3f, -14.94f);
        e.curveTo(12.49f, 3.89f, 11.51f, 3.89f, 11.13f, 4.57f);
        k4.r(e, 13.0f, 8.92f, 18.6f, 19.0f);
        bv.s(e, 13.0f, 8.92f, 11.0f, 8.92f);
        e.verticalLineTo(19.0f);
        e.horizontalLineTo(5.4f);
        e.lineTo(11.0f, 8.92f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _details = build;
        build.getClass();
        return build;
    }
}
