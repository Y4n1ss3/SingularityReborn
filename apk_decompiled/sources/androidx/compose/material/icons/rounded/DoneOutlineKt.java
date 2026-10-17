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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoneOutlineKt {
    private static ImageVector _doneOutline;

    public static final ImageVector getDoneOutline(Icons.Rounded rounded) {
        ImageVector imageVector = _doneOutline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DoneOutline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.47f, 5.63f);
        b.curveToRelative(0.39f, 0.39f, 0.39f, 1.01f, 0.0f, 1.4f);
        b.lineTo(9.13f, 18.37f);
        b.curveToRelative(-0.39f, 0.39f, -1.01f, 0.39f, -1.4f, 0.0f);
        b.lineToRelative(-4.2f, -4.2f);
        b.curveToRelative(-0.39f, -0.39f, -0.39f, -1.01f, 0.0f, -1.4f);
        b.curveToRelative(0.39f, -0.39f, 1.01f, -0.39f, 1.4f, 0.0f);
        b.lineToRelative(3.5f, 3.5f);
        b.lineTo(19.07f, 5.63f);
        b.curveToRelative(0.39f, -0.39f, 1.01f, -0.39f, 1.4f, 0.0f);
        k4.x(b, 18.36f, 3.51f, -9.93f, 9.93f);
        b.lineToRelative(-2.79f, -2.79f);
        b.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        b.lineToRelative(-1.4f, 1.4f);
        b.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        b.lineToRelative(5.6f, 5.6f);
        b.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        b.lineTo(22.59f, 7.74f);
        b.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        b.lineToRelative(-1.4f, -1.4f);
        b.curveToRelative(-0.79f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doneOutline = build;
        build.getClass();
        return build;
    }
}
