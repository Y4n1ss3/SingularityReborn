package androidx.compose.ui.graphics;

import android.graphics.Shader;
import defpackage.er;
import defpackage.yn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface Paint {
    @er
    default android.graphics.Paint asFrameworkPaint() {
        throw new yn("An operation is not implemented.");
    }

    float getAlpha();

    /* renamed from: getBlendMode-0nO6VwU */
    int mo4630getBlendMode0nO6VwU();

    /* renamed from: getColor-0d7_KjU */
    long mo4631getColor0d7_KjU();

    ColorFilter getColorFilter();

    /* renamed from: getFilterQuality-f-v9h1I */
    int mo4632getFilterQualityfv9h1I();

    PathEffect getPathEffect();

    Shader getShader();

    /* renamed from: getStrokeCap-KaPHkGw */
    int mo4633getStrokeCapKaPHkGw();

    /* renamed from: getStrokeJoin-LxFBmk8 */
    int mo4634getStrokeJoinLxFBmk8();

    float getStrokeMiterLimit();

    float getStrokeWidth();

    /* renamed from: getStyle-TiuSbCo */
    int mo4635getStyleTiuSbCo();

    boolean isAntiAlias();

    void setAlpha(float f);

    void setAntiAlias(boolean z);

    /* renamed from: setBlendMode-s9anfk8 */
    void mo4636setBlendModes9anfk8(int i);

    /* renamed from: setColor-8_81llA */
    void mo4637setColor8_81llA(long j);

    void setColorFilter(ColorFilter colorFilter);

    /* renamed from: setFilterQuality-vDHp3xo */
    void mo4638setFilterQualityvDHp3xo(int i);

    void setPathEffect(PathEffect pathEffect);

    void setShader(Shader shader);

    /* renamed from: setStrokeCap-BeK7IIE */
    void mo4639setStrokeCapBeK7IIE(int i);

    /* renamed from: setStrokeJoin-Ww9F2mQ */
    void mo4640setStrokeJoinWw9F2mQ(int i);

    void setStrokeMiterLimit(float f);

    void setStrokeWidth(float f);

    /* renamed from: setStyle-k9PVt8s */
    void mo4641setStylek9PVt8s(int i);
}
