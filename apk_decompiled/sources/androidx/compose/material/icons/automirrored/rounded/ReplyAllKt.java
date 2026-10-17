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
import defpackage.bv;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ReplyAllKt {
    private static ImageVector _replyAll;

    public static final ImageVector getReplyAll(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _replyAll;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.ReplyAll", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.0f, 7.56f);
        b.curveToRelative(0.0f, -0.94f, -1.14f, -1.42f, -1.81f, -0.75f);
        b.lineTo(0.71f, 11.29f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(4.48f, 4.48f);
        b.curveToRelative(0.67f, 0.68f, 1.81f, 0.2f, 1.81f, -0.74f);
        b.curveToRelative(0.0f, -0.28f, -0.11f, -0.55f, -0.31f, -0.75f);
        b.lineTo(3.0f, 12.0f);
        b.lineToRelative(3.69f, -3.69f);
        b.curveToRelative(0.2f, -0.2f, 0.31f, -0.47f, 0.31f, -0.75f);
        bv.g(b, 13.0f, 9.0f, 7.41f);
        b.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        b.lineTo(6.7f, 11.29f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(4.59f, 4.59f);
        b.curveToRelative(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f);
        b.verticalLineTo(14.9f);
        b.curveToRelative(5.0f, 0.0f, 8.5f, 1.6f, 11.0f, 5.1f);
        b.curveToRelative(-1.0f, -5.0f, -4.0f, -10.0f, -11.0f, -11.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _replyAll = build;
        build.getClass();
        return build;
    }
}
