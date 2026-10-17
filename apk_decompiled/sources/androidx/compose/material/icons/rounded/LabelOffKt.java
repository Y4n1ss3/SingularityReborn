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
import defpackage.er;
import defpackage.fc;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LabelOffKt {
    private static ImageVector _labelOff;

    public static final ImageVector getLabelOff(Icons.Rounded rounded) {
        ImageVector imageVector = _labelOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LabelOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.59f, 12.58f);
        b.curveToRelative(0.25f, -0.35f, 0.25f, -0.81f, 0.0f, -1.16f);
        b.lineToRelative(-3.96f, -5.58f);
        b.curveTo(17.27f, 5.33f, 16.67f, 5.0f, 16.0f, 5.0f);
        b.horizontalLineTo(8.66f);
        fc.C(b, 10.7f, 10.73f, 2.23f, -3.15f);
        b.moveTo(2.72f, 4.72f);
        b.lineToRelative(0.87f, 0.87f);
        b.curveTo(3.23f, 5.95f, 3.0f, 6.45f, 3.0f, 7.0f);
        b.verticalLineToRelative(10.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(12.0f);
        b.lineToRelative(1.29f, 1.29f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.lineTo(4.14f, 3.31f);
        b.curveToRelative(-0.38f, -0.38f, -1.01f, -0.39f, -1.4f, -0.01f);
        b.curveToRelative(-0.41f, 0.38f, -0.41f, 1.03f, -0.02f, 1.42f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _labelOff = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getLabelOff$annotations(Icons.Rounded rounded) {
    }
}
