package androidx.compose.material.icons.sharp;

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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SignpostKt {
    private static ImageVector _signpost;

    public static final ImageVector getSignpost(Icons.Sharp sharp) {
        ImageVector imageVector = _signpost;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Signpost", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(1.0f);
        b.horizontalLineTo(5.5f);
        b.curveTo(4.67f, 4.0f, 4.0f, 4.67f, 4.0f, 5.5f);
        b.verticalLineToRelative(3.0f);
        b.curveTo(4.0f, 9.33f, 4.67f, 10.0f, 5.5f, 10.0f);
        r6.y(b, 11.0f, 2.0f, 6.62f);
        b.curveToRelative(-0.4f, 0.0f, -0.78f, 0.16f, -1.06f, 0.44f);
        b.lineToRelative(-1.5f, 1.5f);
        b.curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f);
        b.lineToRelative(1.5f, 1.5f);
        b.curveTo(5.84f, 17.84f, 6.22f, 18.0f, 6.62f, 18.0f);
        b.horizontalLineTo(11.0f);
        b.verticalLineToRelative(3.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-3.0f);
        b.horizontalLineToRelative(5.5f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        b.verticalLineToRelative(-3.0f);
        b.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        af0.u(b, 13.0f, -2.0f, 4.38f);
        b.curveToRelative(0.4f, 0.0f, 0.78f, -0.16f, 1.06f, -0.44f);
        b.lineToRelative(1.5f, -1.5f);
        b.curveToRelative(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f);
        b.lineToRelative(-1.5f, -1.5f);
        b.curveTo(18.16f, 4.16f, 17.78f, 4.0f, 17.38f, 4.0f);
        b.horizontalLineTo(13.0f);
        b.verticalLineTo(3.0f);
        b.curveTo(13.0f, 2.45f, 12.55f, 2.0f, 12.0f, 2.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signpost = build;
        build.getClass();
        return build;
    }
}
