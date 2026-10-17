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
import defpackage.af0;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShuffleKt {
    private static ImageVector _shuffle;

    public static final ImageVector getShuffle(Icons.Rounded rounded) {
        ImageVector imageVector = _shuffle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Shuffle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(10.59f, 9.17f, 6.12f, 4.7f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        fc.C(i, 4.46f, 4.46f, 1.42f, -1.4f);
        i.moveTo(15.35f, 4.85f);
        i.lineToRelative(1.19f, 1.19f);
        i.lineTo(4.7f, 17.88f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.lineTo(17.96f, 7.46f);
        i.lineToRelative(1.19f, 1.19f);
        i.curveToRelative(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.36f);
        i.lineTo(20.0f, 4.5f);
        i.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        i.horizontalLineToRelative(-3.79f);
        i.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.36f, 0.85f);
        k4.x(i, 14.83f, 13.41f, -1.41f, 1.41f);
        i.lineToRelative(3.13f, 3.13f);
        i.lineToRelative(-1.2f, 1.2f);
        i.curveToRelative(-0.31f, 0.31f, -0.09f, 0.85f, 0.36f, 0.85f);
        i.horizontalLineToRelative(3.79f);
        i.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        i.verticalLineToRelative(-3.79f);
        i.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, -1.19f, 1.19f, -3.13f, -3.14f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _shuffle = build;
        build.getClass();
        return build;
    }
}
