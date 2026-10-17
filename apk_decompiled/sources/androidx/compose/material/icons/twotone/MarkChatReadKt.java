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
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MarkChatReadKt {
    private static ImageVector _markChatRead;

    public static final ImageVector getMarkChatRead(Icons.TwoTone twoTone) {
        ImageVector imageVector = _markChatRead;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MarkChatRead", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.0f, 10.0f);
        b.curveToRelative(0.34f, 0.0f, 0.67f, 0.03f, 1.0f, 0.08f);
        bv.A(b, 4.0f, 4.0f, 12.0f, 8.08f);
        b.curveTo(12.57f, 12.61f, 15.47f, 10.0f, 19.0f, 10.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.34f, 20.0f, -3.54f, -3.54f);
        e.lineToRelative(1.41f, -1.41f);
        e.lineToRelative(2.12f, 2.12f);
        e.lineToRelative(4.24f, -4.24f);
        r6.C(e, 23.0f, 14.34f, 17.34f, 20.0f);
        uo.p(e, 12.08f, 16.0f, 4.0f, 4.0f);
        e.horizontalLineToRelative(16.0f);
        e.verticalLineToRelative(6.08f);
        e.curveToRelative(0.71f, 0.1f, 1.38f, 0.31f, 2.0f, 0.6f);
        e.verticalLineTo(4.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.horizontalLineTo(4.0f);
        e.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        r6.h(e, 18.0f, 4.0f, -4.0f, 6.0f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(0.0f, -0.14f, 0.02f, -0.27f, 0.03f, -0.4f);
        e.curveTo(12.01f, 17.4f, 12.0f, 17.2f, 12.0f, 17.0f);
        e.curveTo(12.0f, 16.66f, 12.03f, 16.33f, 12.08f, 16.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _markChatRead = build;
        build.getClass();
        return build;
    }
}
