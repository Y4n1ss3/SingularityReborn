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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RemoveDoneKt {
    private static ImageVector _removeDone;

    public static final ImageVector getRemoveDone(Icons.Rounded rounded) {
        ImageVector imageVector = _removeDone;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RemoveDone", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(4.14f, 2.69f, 4.14f, 2.69f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(9.67f, 9.67f);
        i.lineToRelative(-1.41f, 1.41f);
        i.lineToRelative(-3.54f, -3.53f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(4.24f, 4.24f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.lineToRelative(2.12f, -2.12f);
        i.lineToRelative(5.89f, 5.89f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        i.lineTo(5.55f, 2.69f);
        i.curveTo(5.16f, 2.3f, 4.53f, 2.3f, 4.14f, 2.69f);
        k4.x(i, 18.05f, 12.36f, 4.24f, -4.24f);
        i.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, -0.01f, -1.42f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(-0.39f, -0.38f, -1.02f, -0.38f, -1.41f, 0.01f);
        gy.B(i, -4.24f, 4.24f, 18.05f, 12.36f);
        i.moveTo(16.64f, 6.7f);
        i.lineTo(16.64f, 6.7f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.lineToRelative(-1.42f, 1.42f);
        i.lineToRelative(1.41f, 1.41f);
        i.lineToRelative(1.42f, -1.42f);
        i.curveTo(17.03f, 7.72f, 17.03f, 7.09f, 16.64f, 6.7f);
        k4.x(i, 1.79f, 13.06f, 4.95f, 4.95f);
        i.lineToRelative(1.41f, -1.41f);
        i.lineTo(3.2f, 11.65f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveTo(1.4f, 12.04f, 1.4f, 12.67f, 1.79f, 13.06f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeDone = build;
        build.getClass();
        return build;
    }
}
