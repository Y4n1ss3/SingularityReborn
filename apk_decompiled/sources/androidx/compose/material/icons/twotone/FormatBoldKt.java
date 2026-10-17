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
import defpackage.af0;
import defpackage.fc;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatBoldKt {
    private static ImageVector _formatBold;

    public static final ImageVector getFormatBold(Icons.TwoTone twoTone) {
        ImageVector imageVector = _formatBold;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FormatBold", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.25f, 8.0f);
        b.curveToRelative(0.0f, -2.26f, -1.75f, -4.0f, -4.0f, -4.0f);
        af0.m(b, 7.0f, 4.0f, 14.0f, 7.04f);
        b.curveToRelative(2.09f, 0.0f, 3.71f, -1.7f, 3.71f, -3.79f);
        b.curveToRelative(0.0f, -1.52f, -0.86f, -2.82f, -2.15f, -3.42f);
        b.curveToRelative(0.97f, -0.67f, 1.65f, -1.77f, 1.65f, -2.79f);
        af0.l(b, 10.0f, 6.5f, 3.0f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        fc.x(b, -3.0f, -3.0f, 13.5f, 15.5f);
        af0.m(b, 10.0f, 15.5f, -3.0f, 3.5f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -0.67f, 1.5f, -1.5f, 1.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatBold = build;
        build.getClass();
        return build;
    }
}
