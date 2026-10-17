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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatOverlineKt {
    private static ImageVector _formatOverline;

    public static final ImageVector getFormatOverline(Icons.Rounded rounded) {
        ImageVector imageVector = _formatOverline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FormatOverline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(5.0f, 4.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(12.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineTo(6.0f);
        b.curveTo(5.45f, 5.0f, 5.0f, 4.55f, 5.0f, 4.0f);
        b.close();
        b.moveTo(12.0f, 7.0f);
        b.curveToRelative(-3.87f, 0.0f, -7.0f, 3.13f, -7.0f, 7.0f);
        b.curveToRelative(0.0f, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        b.reflectiveCurveToRelative(7.0f, -3.13f, 7.0f, -7.0f);
        b.curveTo(19.0f, 10.13f, 15.87f, 7.0f, 12.0f, 7.0f);
        b.close();
        b.moveTo(12.0f, 18.5f);
        b.curveToRelative(-2.49f, 0.0f, -4.5f, -2.01f, -4.5f, -4.5f);
        b.reflectiveCurveTo(9.51f, 9.5f, 12.0f, 9.5f);
        b.reflectiveCurveToRelative(4.5f, 2.01f, 4.5f, 4.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 14.49f, 18.5f, 12.0f, 18.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatOverline = build;
        build.getClass();
        return build;
    }
}
