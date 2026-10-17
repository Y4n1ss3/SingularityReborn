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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatColorResetKt {
    private static ImageVector _formatColorReset;

    public static final ImageVector getFormatColorReset(Icons.Sharp sharp) {
        ImageVector imageVector = _formatColorReset;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FormatColorReset", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 14.0f);
        b.curveToRelative(0.0f, -3.98f, -6.0f, -10.8f, -6.0f, -10.8f);
        b.reflectiveCurveToRelative(-1.18f, 1.35f, -2.5f, 3.19f);
        b.lineToRelative(8.44f, 8.44f);
        b.curveToRelative(0.03f, -0.27f, 0.06f, -0.55f, 0.06f, -0.83f);
        k4.r(b, 5.41f, 5.14f, 4.0f, 6.55f);
        b.lineToRelative(3.32f, 3.32f);
        b.curveTo(6.55f, 11.33f, 6.0f, 12.79f, 6.0f, 14.0f);
        b.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        b.curveToRelative(1.52f, 0.0f, 2.9f, -0.57f, 3.95f, -1.5f);
        b.lineToRelative(2.63f, 2.63f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 20.0f, 19.72f, 5.41f, 5.14f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatColorReset = build;
        build.getClass();
        return build;
    }
}
