package androidx.compose.material.icons.automirrored.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LabelImportantKt {
    private static ImageVector _labelImportant;

    public static final ImageVector getLabelImportant(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _labelImportant;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.LabelImportant", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(5.94f, 18.99f, 15.0f);
        d.curveToRelative(0.65f, 0.0f, 1.26f, -0.31f, 1.63f, -0.84f);
        d.lineToRelative(3.95f, -5.57f);
        d.curveToRelative(0.25f, -0.35f, 0.25f, -0.81f, 0.0f, -1.16f);
        d.lineToRelative(-3.96f, -5.58f);
        d.curveTo(16.26f, 5.31f, 15.65f, 5.0f, 15.0f, 5.0f);
        d.horizontalLineTo(5.94f);
        d.curveToRelative(-0.81f, 0.0f, -1.28f, 0.93f, -0.81f, 1.59f);
        d.lineTo(9.0f, 12.0f);
        d.lineToRelative(-3.87f, 5.41f);
        d.curveToRelative(-0.47f, 0.66f, 0.0f, 1.58f, 0.81f, 1.58f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _labelImportant = build;
        build.getClass();
        return build;
    }
}
