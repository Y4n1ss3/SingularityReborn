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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UndoKt {
    private static ImageVector _undo;

    public static final ImageVector getUndo(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _undo;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.Undo", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.5f, 8.0f);
        b.curveToRelative(-2.65f, 0.0f, -5.05f, 0.99f, -6.9f, 2.6f);
        b.lineTo(3.71f, 8.71f);
        b.curveTo(3.08f, 8.08f, 2.0f, 8.52f, 2.0f, 9.41f);
        b.verticalLineTo(15.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(5.59f);
        b.curveToRelative(0.89f, 0.0f, 1.34f, -1.08f, 0.71f, -1.71f);
        b.lineToRelative(-1.91f, -1.91f);
        b.curveToRelative(1.39f, -1.16f, 3.16f, -1.88f, 5.12f, -1.88f);
        b.curveToRelative(3.16f, 0.0f, 5.89f, 1.84f, 7.19f, 4.5f);
        b.curveToRelative(0.27f, 0.56f, 0.91f, 0.84f, 1.5f, 0.64f);
        b.curveToRelative(0.71f, -0.23f, 1.07f, -1.04f, 0.75f, -1.72f);
        b.curveTo(20.23f, 10.42f, 16.65f, 8.0f, 12.5f, 8.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _undo = build;
        build.getClass();
        return build;
    }
}
